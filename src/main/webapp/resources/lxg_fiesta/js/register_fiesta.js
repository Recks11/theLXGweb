$(document).ready(function () {

    var fiestaForm = $("#fiestaRegForm");
    fiestaForm.submit(function (event) {
        //stop submit the form, we will post it manually.
        event.preventDefault();
    });

    var csrfParameter = $("meta[name='_csrf_parameter']").attr("content"); //CSRF token for non-www-encoded-ajax requests
    var csrfHeader = $("meta[name='_csrf_header']").attr("content"); //CSRF token for non-www-encoded-ajax requests
    var csrfToken = $("meta[name='_csrf']").attr("content"); //CSRF token for non-www-encoded-ajax requests

    fiestaForm.validate({
        rules: {
            firstName: "required",
            lastName: "required",
            alias: {
                required: true,
                minlength: 5
            },
            emailAddress: {
                required: true,
                email: true
            },
            phoneNumber: {
                required: true,
                minlength: 10
            },
            twitterHandle: {
                required: "#twitter:checked",
                minlength: 3
            },
            instagramHandle: {
                required: "#instagram:checked",
                minlength: 3
            }
        },
        messages: {
            firstName: "Please Enter your first name",
            lastName: "Please Enter your last name",
            alias: {
                required: "please enter your username",
                minlength: "username must be more than 4 letters"
            },
            phoneNumber: {
                required: "Please enter your phone number",
                minlength: "phone number might be incorrect"
            },
            twitterHandle: {
                required: "Please enter your twitter handle",
                minlength: "please enter a valid twitter handle"
            },
            instagramHandle: {
                required: "Please enter your instagram name",
                minlength: "instagram handle not valid"
            }
        },
        submitHandler: function (form) {
            // var test = 'TX2oo1334';
            // savePlayer('Test');
            payWithPaystack();

        }
    });

    //hide and show instagram and twitter sections conditionally

    var twitter = $("#twitter");
    var initial = twitter.is(":checked");
    var handle = $("#tweet")[initial ? "removeClass" : "addClass"]("hide");
    var handleInput = handle.find("input").attr("disabled", !initial);

    var insta = $("#instagram");
    var initialInsta = insta.is(":checked");
    var instahandle = $("#gram")[initialInsta ? "removeClass" : "addClass"]("hide");
    var instahandleInput = instahandle.find("input").attr("disabled", !initial);

    twitter.click(function () {
        handle[this.checked ? "removeClass" : "addClass"]("hide");
        handleInput.attr("disabled", !this.checked);
    });

    insta.click(function () {
        instahandle[this.checked ? "removeClass" : "addClass"]("hide");
        instahandleInput.attr("disabled", !this.checked)
    });


    function savePlayer(reference) {
        var headers = {};
        headers[csrfHeader] = csrfToken; //CSRF token for non -x-www-form-urlencoded requests
        var data = {};
        data['firstName'] = $('#firstName').val();
        data['lastName'] = $('#lastName').val();
        data['alias'] = $('#alias').val();
        data['email'] = $('#emailAddress').val();
        data['phoneNumber'] = $('#phoneNumber').val();
        data['twitterHandle'] = $('#twitterHandle').val();
        data['instagramHandle'] = $('#instagramHandle').val();
        data['reference'] = reference;

        $.ajax({
            type: "POST",
            contentType: "application/json",
            url: ctx + "/fiesta/rest/register",
            data: JSON.stringify(data),
            dataType: 'html',
            timeout: 360000,
            headers: headers,

            success: function (response) {
                alert(data.firstName + " " + data.lastName + ' Welcome To the Tournament');
                window.location.href = ctx + "/fiesta/home";
                //...
            },
            error: function (xhr, status, error) {
                alert("There was an error" + error);
            }
        });
    }

    function payWithPaystack() {
        var email = $('#emailAddress').val();
        var phone = $('#phoneNumber').val();
        var handler = PaystackPop.setup({
            key: 'pk_live_6d4f0fb7e519ebaedaf2953fac3b261a9197d02f',
            email: email,
            amount: 200000,
            ref: "theLXG-Player".email,
            metadata: {
                custom_fields: [
                    {
                        display_name: "Mobile Number",
                        variable_name: "mobile_number",
                        value: phone
                    }
                ]
            },
            callback: function (response) {
                alert('success. transaction ref is ' + response.reference)
                var reference = response.reference;
                savePlayer(reference);
            },
            onClose: function () {
                alert('Payment must be made successfully before registration can be completed');
            }
        });
        handler.openIframe();
    }
});
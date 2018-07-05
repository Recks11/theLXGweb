$(document).ready(function () {

    $("#paymentForm").submit(function (event) {
        //stop submit the form, we will post it manually.
        event.preventDefault();
    });

    var csrfParameter = $("meta[name='_csrf_parameter']").attr("content"); //CSRF token for non-www-encoded-ajax requests
    var csrfHeader = $("meta[name='_csrf_header']").attr("content"); //CSRF token for non-www-encoded-ajax requests
    var csrfToken = $("meta[name='_csrf']").attr("content"); //CSRF token for non-www-encoded-ajax requests

    var fullname = function () {
        var fname = $('#firstname').val();
        var lname = $('#lastname').val();

        return fname + " " + lname;
    };
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


    function changeTeam(reference) {
        var headers = {};
        headers[csrfHeader] = csrfToken; //CSRF token for non -x-www-form-urlencoded requests
        var data = {};
        data['firstName'] = $('#firstname').val();
        data['lastName'] = $('#lastname').val();
        data['alias'] = $('#alias').val();
        data['email'] = $('#email').val();
        data['phoneNumber'] = $('#phoneNumber').val();
        data['twitterHandle'] = $('#twitterHandle').val();
        data['instagramHandle'] = $('#instagramHandle').val();
        data['teamCountry'] = $('#teamNation').val();
        data['teamSelected'] = $('#selectedTeam').text();
        data['location'] = $('input[name=location]:checked').val();
        data['reference'] = reference;
        $.ajax({
            type: "POST",
            contentType: "application/json",
            url: ctx + "/enter/",
            data: JSON.stringify(data),
            dataType: 'html',
            timeout: 360000,
            headers: headers,

            success: function (response) {
                alert(data.firstName + " " + data.lastName + ' Welcome To the Tournament');
                window.location.href = ctx + "/";
                //...
            },
            error: function (xhr, status, error) {
                alert("There was an error" + error);
            }
        });

    }


    function payWithPaystack() {
        var email = $('#email').val();
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

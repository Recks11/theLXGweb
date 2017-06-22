$(document).ready(function() {


    $("#paymentForm").submit(function (event) {
        //stop submit the form, we will post it manually.
        event.preventDefault();
    });

    $("#paymentForm").validate({
        rules:{
            firstName: "required",
            lastName: "required",
            alias: {
                required: true,
                minlength: 4
            },
            email:{
                required: true,
                email: true
            },
            phoneNumber:{
                required: true,
                minlength: 11
            },
            twitterHandle:{
                required: "#twitter:checked",
                minlength: 3
            },
            instagramHandle: {
                required: "#instagram:checked",
                minlength: 3
            },
            location: {
                required: true
            },
            social_acc:{
                required: true,
                minlength: 1
            }
        },
        messages:{
            firstName: "Please Enter your first name",
            lastName: "Please Enter your last name",
            alias: {
                required: "please enter your username",
                minlength: "username must be more than 4 letters"
            },
            phoneNumber:{
                required: "Please enter your phone number",
                minlength: "phone number might be incorrect"
            },
            twitterHandle:{
                required: "Please enter your twitter handle",
                minlength: "please enter a valid twitter handle"
            },
            instagramHandle: {
                required: "Please enter your instagram name",
                minlength: "instagram handle not valid"
            },
            location:{
                required: ""
            },
            social_acc:{
                required:  "",
                minlength: ""
            }
        },
        submitHandler: function(form){
            payWithPaystack();
            // savePlayer();
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

    twitter.click(function(){
        handle[this.checked ? "removeClass" : "addClass"]("hide");
        handleInput.attr("disabled" , !this.checked);
    });

    insta.click(function(){
       instahandle[this.checked ? "removeClass" : "addClass"]("hide");
       instahandleInput.attr("disabled", !this.checked)
    });



    function savePlayer(){
        var  data = {};
        data['firstName'] = $('#firstname').val();
        data['lastName'] = $('#lastname').val();
        data['alias'] = $('#alias').val();
        data['email'] = $('#email').val();
        data['phoneNumber'] = $('#phoneNumber').val();
        data['twitterHandle'] = $('#twitterHandle').val();
        data['instagramHandle'] = $('#instagramHandle').val();
        data['teamCountry'] = $('#teamNation').val();
        data['teamSelected'] = $('#team').val();
        data['location'] = $('input[name=location]:checked').val();
        $.ajax({
            type: "POST",
            contentType: "application/json",
            url: ctx+"/enter/",
            data: JSON.stringify(data),
            dataType: 'html',
            timeout: 60000,

            success: function (response) {
                alert( data.firstName + " " +data.lastName +' Welcome To the Tournament');
                window.location.href = ctx+"/";
                //...
            },
            error : function(xhr, status, error) {
                alert("There was an error" +error);
            }
        });

    }


    function payWithPaystack(){
        var email =$('#email').val();
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
            callback: function(response){
                alert('success. transaction ref is ' + response.reference);
                savePlayer();
            },
            onClose: function(){
                alert('Payment must be made successfully before registration can be completed');
            }
        });
        handler.openIframe();
    }

});

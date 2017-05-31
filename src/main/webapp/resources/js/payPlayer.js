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
            location: "required"
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
            location: "required"
        },
        submitHandler: function(form){
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
        data['teamCountry'] = "Spain";
        data['teamSelected'] = "barcelona";
        data['location'] = $('input[name=location]:checked').val();
        $.ajax({
            type: "POST",
            contentType: "application/json",
            url: "/thelxg.com.ng/enter/",
            data: JSON.stringify(data),
            dataType: 'html',
            timeout: 600000,

            success: function (response) {
                alert( data.firstName +" "+data.lastName + 'Welcome To the Tournament');
                window.location.href = "/thelxg.com.ng/";
                //...
            },
            error : function(xhr, status, error) {
                alert("eroor"+error);
            }
        });

    }


    function payWithPaystack(){
        var email =$('#email').val();
        var phone = $('#phoneNumber').val();
        var handler = PaystackPop.setup({
            key: 'pk_test_0a676f1d979cabd881356f2c9983863df9b30d84',
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
                alert('window closed');
            }
        });
        handler.openIframe();
    }

});

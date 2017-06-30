$(document).ready(function() {

    document.getElementById("registerBtn").disabled = true;

    /*variables used*/
    var pinBox = $("#pin");
    var regBtn = $("#registerBtn");
    var paymentForm = $("#paymentForm");
    var pin_no = "data not received";
    var pinNumber = pinBox.val();



    /* functions to execute*/
    verifyPinAndRegister();
    setPin();

    paymentForm.submit(function (event) {
        //stop submit the form, we will post it manually.

        event.preventDefault();
    });


    paymentForm.validate({
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
            },
            ignore: ".ignore"
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
            // payWithPaystack();
            if(pinNumber === pin_no){
                savePlayer();
            }else{
                alert("Wrong Pin! SCAM!!");
                window.location.href = ctx+"/";
            }
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
        var  player_data = {};
        player_data['firstName'] = $('#firstname').val();
        player_data['lastName'] = $('#lastname').val();
        player_data['alias'] = $('#alias').val();
        player_data['email'] = $('#email').val();
        player_data['phoneNumber'] = $('#phoneNumber').val();
        player_data['twitterHandle'] = $('#twitterHandle').val();
        player_data['instagramHandle'] = $('#instagramHandle').val();
        player_data['teamCountry'] = $('#teamNation').val();
        player_data['teamSelected'] = $('#team').val();
        player_data['location'] = $('input[name=location]:checked').val();
        $.ajax({
            type: "POST",
            contentType: "application/json",
            url: ctx+"/phy_register/io",
            data: JSON.stringify(player_data),
            dataType: 'html',
            timeout: 60000,

            success: function (response) {
                alert( player_data.firstName + " " +player_data.lastName +' Welcome To the Tournament');
                window.location.href = ctx+"/";
                //...
            },
            error : function(xhr, status, error) {
                alert("There was an error" +error);
            }
        });

    }


    function setPin(){
        $.get(ctx+"/phy_register/pin", function(data, status, jqXHR){
            pin_no = jqXHR.responseText;
        });
    }


    function verifyPinAndRegister(){

        if(pinBox.val() === pin_no){
            regBtn.removeClass("invalid");
            regBtn.addClass("valid");
            pinBox.addClass("green-border");
            pinBox.addClass("valid");
            pinBox.removeClass("invalid");
            document.getElementById("registerBtn").disabled = false;
        }else{
            regBtn.removeClass("valid");
            regBtn.addClass("invalid");
            pinBox.addClass("invalid");
            pinBox.removeClass("valid");
            pinBox.removeClass("green-border");
            document.getElementById("registerBtn").disabled = true;
        }
    }


    pinBox.on('keyup', function() {
        if (this.value.length > 1) {
            verifyPinAndRegister();
        }

    });
});

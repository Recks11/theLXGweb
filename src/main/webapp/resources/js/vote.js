var disabled;
$(document).ready(function () {
    if (disabled === true) {
        $("#mySubmitButton").prop("disabled", true).addClass("disabled");
    }
});
$("#myform").submit(function (event) {
    $("#mySubmitButton").prop("disabled", true).addClass("disabled");
    disabled = true;
});
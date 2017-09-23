/**
 * Created by rex on 26/05/2017.
 */
var features = "status=yes,toolbar=no,scrollbars=yes,titlebar=no,menubar=no,resizable=yes,width=640,height=480,directories=no,location=no";
(function ($) {


    $(window).scroll(function() {
        if ($(".navbar").offset().top > 70) {
            $(".navbar").addClass("nav-scroll grey-bg");
        } else if ($(".navbar").offset().top < 70) {
            $(".navbar").removeClass("nav-scroll grey-bg");
        }
        if ($(".navbar").offset().top > 1024) {
            $(".vendor-section").removeClass("hide");
        }
    });
})(jQuery);

function socialClickOp(a){
    window.open(a,"_blank",features);
}
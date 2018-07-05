/**
 * Created by rex on 26/05/2017.
 */
(function ($) {


    $(window).scroll(function () {
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
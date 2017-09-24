var features = "status=yes,toolbar=no,scrollbars=yes,titlebar=no,menubar=no,resizable=yes,width=640,height=480,directories=no,location=no";

function openInWindow(link) {
    window.open(link,"_blank",features);
}
function openInNewTab(link) {
    window.open(link, "_blank")
}
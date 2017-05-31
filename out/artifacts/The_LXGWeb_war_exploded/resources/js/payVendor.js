/**
 * Created by rex on 29/05/2017.
 */
function payWithPayStack(){
    var handler = PaystackPop.setup({
        key: 'pk_test_86d32aa1nV4l1da7120ce530f0b221c3cb97cbcc',
        email: 'customer@email.com',
        amount: 60000,
        ref: "UNIQUE TRANSACTION REFERENCE HERE",
        metadata: {
            custom_fields: [
                {
                    display_name: "Mobile Number",
                    variable_name: "mobile_number",
                    value: "+2348012345678"
                }
            ]
        },
        callback: function(response){
            alert('success. transaction ref is ' + response.reference);
        },
        onClose: function(){
            alert('window closed');
        }
    });
    handler.openIframe();
}
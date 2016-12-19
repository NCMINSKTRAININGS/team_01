

function addClaimRequest() {
    var claim = {
        checkInDate: document.getElementById('checkInDate').value,
        checkOutDate: document.getElementById('checkOutDate').value,
        type_room : $('input:radio[name=type]:checked').val(),
        login: document.getElementById('login').value
    };

    $.ajax({
        url: 'addRequest',
        type: 'POST',
        dataType: 'json',
        contentType: 'application/json',
        data: JSON.stringify(claim),
        success: location.href = '/main'
    });
}
$(document).on("click", "#go", function() {
    $.ajax({
        url: 'addRequest2',
        type: 'POST',
        dataType: 'json',
        data: null,
        contentType: 'application/json',
        success: function(data){
            alert(data);
            alert(data.responseText);
            //$("div.ajax").append(data);
        },
        error: function (jqXhr, textStatus, errorThrown) {
            alert("Ошибка '" + jqXhr.status + "' (textStatus: '" + textStatus + "', errorThrown: '" + errorThrown + "')");
        }
    });
});


function addClaimRequest() {
    var claim = {
        checkInDate: document.getElementById('checkInDate').value,
        checkOutDate: document.getElementById('checkOutDate').value,
        type_room : $('input:radio[name=type]:checked').val(),
        login: document.getElementById('login').value
    };

    $.ajax({
        url: '/user/addRequest',
        type: 'POST',
        dataType: 'json',
        contentType: 'application/json',
        data: JSON.stringify(claim),
        success: alert("OK")

    });
}

var types = null;
var k = 0;
function getAllData() {
    alert();
    $.ajax({
        url: '/user/addRequest2',
        dataType: 'json',
        contentType: 'application/json',
        success: function(jsondata) {
            alert(jsondata);
            types= JSON.parse(jsondata.Type);
            alert(types);
            types= JSON.parse(jsondata);
            alert(jsondata.Type);
            alert(types);

        },
            error: function (jqXhr, textStatus, errorThrown) {
            alert("Ошибка '" + jqXhr.status + "' (textStatus: '" + textStatus + "', errorThrown: '" + errorThrown + "')");
        }
    });
}
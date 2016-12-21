function addRoom() {
    var room = {
        coast: document.getElementById('coast').value,
        seats: document.getElementById('seats').value,
        status_id: document.getElementById('status_id').value,
        type_id: document.getElementById('type_id').value
    };

    $.ajax({
        url: '/admin/main',
        type: 'POST',
        dataType: 'json',
        contentType: 'application/json',
        data: JSON.stringify(room),
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
/**
 * Created by Valeria on 13.12.2016.
 */
function registerRoom() {
    var room = {
        coast: document.getElementById('coast').value,
        seats: document.getElementById('seats').value,
        status_id: document.getElementById('status_id').value,
        type_id: document.getElementById('type_id').value
    };

    $.ajax({
        url: '//main',
        type: 'POST',
        dataType: 'json',
        contentType: 'application/json',
        data: JSON.stringify(room),
        success: location.href = 'index.jsp'
    });
}
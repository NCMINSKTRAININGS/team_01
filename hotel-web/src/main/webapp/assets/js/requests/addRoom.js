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
function addRoom() {
    var room = {
        coast: document.getElementById('coast').value,
        seats: document.getElementById('seats').value,
        type_id: $('input:radio[name=type]:checked').val()
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

function setCommandAdmin(cmnd) {
    $.ajax({
        success: location.href = '/admin/main/' + cmnd
    })
}

function getClaimByUser(cmnd , id) {
    $.ajax({
        success: location.href = '/admin/main/' + cmnd + '/' + id
    })
}
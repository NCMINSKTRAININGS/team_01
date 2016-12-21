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


function addClaimCommand(cmnd) {
    var command = {
        command : cmnd
    };
    $.ajax({
        type: 'POST',
        dataType: 'json',
        contentType: 'application/json',
        data: JSON.stringify(command),
        success: location.href = '/user/getCommand'
    })
}

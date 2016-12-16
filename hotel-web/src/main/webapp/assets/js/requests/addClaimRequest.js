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
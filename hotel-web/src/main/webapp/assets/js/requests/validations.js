function validation_signIn() {
    var login = document.getElementById("login").value;
    var password1 = document.getElementById("password").value;
    var r=/[^A-Z-a-z-0-9]/g;

    if(r.test(login)){
        alert(" Please enter numbers and characters and don't attach any symbols to login");
        return false;
    }
    return true;
}
function validation_addClaim() {
    var pattern = /^([0-9]{2}).([0-9]{2}).([0-9]{4})$/;
    var inDate = document.getElementById("checkInDate").value;
    var outDate = document.getElementsByName("checkOutDate").value;

    if (!pattern.test(inDate)){
        alert("OutDate don't match style");
        return false;
    }

    if (!pattern.test(outDate)){
        alert("InDate don't match style");
        return false;
    }
    return true;
}
function validation_registration() {
    var login = document.getElementById("login").value;
    var name = document.getElementById("name").value;
    var surname = document.getElementById("surname").value;
    var password1 = document.getElementById("password1").value;
    var password2 = document.getElementById("password2").value;
    var r=/[^A-Z-a-z-0-9]/g;

    if (login.length < 6 || login.length > 10) {
        alert("login will be between 6 and 12 characters ");
        return false;
    }
    if(r.test(login)){
        alert(" Please enter numbers and characters and don't attach any symbols to login");
        return false;
    }
    if(r.test(name)){
        alert(" Please enter numbers and characters and don't attach any symbols to name");
        return false;
    }
    if(r.test(surname)){
        alert(" Please enter numbers and characters and don't attach any symbols surname");
        return false;
    }
    if(r.test(password1)){
        alert("Please enter numbers and characters and don't attach any symbols to passwords");
        return false;
    }
    if (password1 != password2) {
        alert("passwords don't match");
        return false;
    }
    if (password1.length < 6 || password1.length > 12) {
        alert("password will be between 6 and 12 characters");
        return false;
    }
    return true;
}
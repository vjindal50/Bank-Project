function validateFomr() {
	var uname= document.forms["loginForm"]["txtusername"].value
	var pass= document.forms["loginForm"]["txtpassword"].value

	if (uname == null || uname == "") {
        alert("User Name must be filled out");
        return false;
    }
    if (pass == null || pass == "") {
        alert("Passward must be filled out");
        return false;
    }
}
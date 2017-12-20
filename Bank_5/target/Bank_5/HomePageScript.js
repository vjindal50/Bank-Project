	function searchCust(){
			var z = document.getElementById("sidemenucontent");
			var text = "";
			text += '<form method="post" action="searchCust">';
			text += '<div class="divtext">First Name : </div><input type="text" name="fname"><br><br>';
			text += '<div class="divtext">Last Name :</div><input type="text" name="lname"><br><br>';
			text += '<div class="divtext">Middle Name : </div><input type="text" name="mname"><br><br>';
			text += '<div class="divtext">Phone : </div><input type="Phone" name="phone"><br><br>';
			text += '<div class="divtext">Alternate Phone : </div><input type="phone" name="altphone"><br><br>';
			text += '<div class="divtext">Email : </div><input type="Email" name="email"><br><br>';
			text += '<div class="divtext">Address : </div><input type="text" name="address"><br><br>';
			text += '<div class="divtext">User Name : </div><input type="text" name="uname"><br><br>';
			text += '<div class="divtext">D.O.B. :</div><input type="date" name="dob"><br><br>';
			text += '<input class="butts" type="submit" name="submit" value="Search">';
			text += '<input class="butts" type="reset" name="reset" value="Reset">';
			text += '</form>';
			z.innerHTML = text;
			console.log("hey");
		}
		function viewCustLog(){
			var z = document.getElementById("sidemenucontent");
			var text = "";
			text += '<table>';
			text += '<tr><th>Cust ID</th><th>Full Name</th><th>Account Number</th><th>User ID</th><th>Status</th></tr>';
			text += '<c:forEach>';
			text += '<tr><td>${}</td><td>${}</td><td>${}</td><td>${}</td><td>${}</td></tr>';
			text += '</c:forEach>';
			text += '</table>';
			z.innerHTML = text;
		}
		function viewProfile(){
			var z = document.getElementById("sidemenucontent");
			var text = "";
			text += '<div class="divtext">Fisrt Name : </div>${}';
			text += '<br><div class="divtext">Middle Name : </div>${}';
			text += '<br><div class="divtext">Last Name: </div>${}';
			text += '<br><div class="divtext">ID : </div>${}';
			text += '<br><div class="divtext">Phone : </div>${}';
			text += '<br><div class="divtext">Alternate Phone : </div>${}';
			text += '<br><div class="divtext">Email : </div>${}';
			text += '<br><div class="divtext">Address : </div>${}';
			text += '<br><div class="divtext">D.O.B : </div>${}';
			text += '<br><div class="divtext">User Name : </div>${}';
			text += '<br><div class="divtext">Password : </div>${}';
			text += '<br><button onclick="updateProfile()">UPDATE PROFILE</button>';
			z.innerHTML = text;
		}
		function updateProfile(){
			var z = document.getElementById("sidemenucontent");
			var text = "";
			text += '<form method="post" action="updateEmpProfile">';
			text += '<div class="divtext">First Name : </div><input type="text" name="fname"><br><br>';
			text += '<div class="divtext">Last Name :</div><input type="text" name="lname"><br><br>';
			text += '<div class="divtext">Middle Name : </div><input type="text" name="mname"><br><br>';
			text += '<div class="divtext">Phone : </div><input type="Phone" name="phone"><br><br>';
			text += '<div class="divtext">Alternate Phone : </div><input type="phone" name="altphone"><br><br>';
			text += '<div class="divtext">Email : </div><input type="Email" name="email"><br><br>';
			text += '<div class="divtext">Address : </div><input type="text" name="address"><br><br>';
			text += '<div class="divtext">User Name : </div><input type="text" name="uname"><br><br>';
			text += '<div class="divtext">Password : </div><input type="Password" name="pass"><br><br>';
			text += '<div class="divtext">D.O.B. :</div><input type="date" name="dob" required><br><br>';
			text += '<input class="butts" type="submit" name="submit" value="Update">';
			text += '<input class="butts" type="reset" name="reset" value="Reset">';
			text += '</form>';
			text += '<button onclick="viewProfile()">Back</button>';
			z.innerHTML = text;
		}
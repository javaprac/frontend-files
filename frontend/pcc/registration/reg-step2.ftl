<!DOCTYPE html>
<html>
<link rel="stylesheet" type="text/css" href="/static/css/reg/regstyle2.css">
<title>Register user</title>
<body>
	User name : ${form.userName}
	Email : ${form.email}
	<div id="regform" class="submit-form">
		<form action="regstep3" method="post">
			<table>
				<tr>
					<td class="label">
						<label for="firstName">First Name</label>
					</td>
					<td class="field">
						<input type="text" name="firstName" id="firstName" maxlength="10">
					</td>
				</tr>
				<tr>
					<td class="label">
						<label for="middleName">Middle Name</label>
					</td>
					<td class="field">
						<input type="text" name="middleName" id="middleName" maxlength="10">
					</td>
				</tr>
				<tr>
					<td class="label">
						<label for="lastName">Last Name</label>
					</td>
					<td class="field">
						<input type="text" name="lastName" id="lastName" maxlength="10">
					</td>
				</tr>
				<tr>
					<td class="label">
						<label for="dateOfBirth">Date of Birth</label>
					</td>
					<td class="field">
						<input type="text" name="dateOfBirth" id="dateOfBirth">
					</td>
				</tr>
				<tr>
					<td class="label">
						<label for="gender">Gender</label>
					</td>
					<td class="field">
						<select name="gender" id="gender">
							<option value="M">Male</option>
							<option value="F">Female</option>
						</select>
					</td>
				</tr>
				<tr>
					<td class="label">
						<label for="maritalStatus">Marital Status</label>
					</td>
					<td class="field">
						<select name="maritalStatus" id="maritalStatus">
							<option value="S">Single</option>
							<option value="M">Married</option>
						</select>
					</td>
				</tr>
				<tr>
					<td colspan="2" class="field">
						<input type="submit" name="submit" value="Next">
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>
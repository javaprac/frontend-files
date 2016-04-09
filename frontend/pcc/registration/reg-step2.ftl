<!DOCTYPE html>
<html>
<link rel="stylesheet" type="text/css" href="/static/css/reg/regstyle2.css">
<link rel="stylesheet" type="text/css" href="/static/css/reg/regstyle-common.css">
<title>Register user</title>
<body>
<#include "includes/header.inc">
	<div id="regform" class="submit-form regform-common">
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
					<td class="label">
						<label for="addressLine1">Address Line 1</label>
					</td>
					<td class="field">
						<input type="text" name="addressLine1" id="addressLine1">
					</td>
					</td>
				</tr>
				<tr>
					<td class="label">
						<label for="addressLine2">Address Line 2</label>
					</td>
					<td class="field">
						<input type="text" name="addressLine2" id="addressLine2">
					</td>
					</td>
				</tr>
				<tr>
					<td class="label">
						<label for="addressLine3">Address Line 3</label>
					</td>
					<td class="field">
						<input type="text" name="addressLine3" id="addressLine3">
					</td>
					</td>
				</tr>
				<tr>
					<td class="label">
						<label for="addressLine1">Address Line 4</label>
					</td>
					<td class="field">
						<input type="text" name="addressLine4" id="addressLine4">
					</td>
					</td>
				</tr>
				<tr>
					<td class="label">
						<label for="identity">Identity Document</label>
					</td>
					<td class="field">
						<select name="identityType" id="identityType">
							<option value="PAN">PAN</option>
							<option value="PP">Passport</option>
							<option value="PP">Voter ID</option>
						</select>
						<input type="text" name="identifier" id="identifier" id="identifier" maxlength="10" size="8">
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
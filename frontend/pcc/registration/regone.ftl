<!DOCTYPE html>
<html>
<link rel="stylesheet" type="text/css" href="/static/css/reg/regstyle.css">
<link rel="stylesheet" type="text/css" href="/static/css/reg/regstyle-common.css">
<title>Register user</title>
<body>
	<#include "includes/header.inc">
	<div id="regform" class="submit-form regform-common">
		<form action="regstep2" method="post">
			<table>
				<tr>
					<td class="label">
						<label for="userName">User Name</label>
					</td>
					<td class="field">
						<input type="text" name="userName" id="userName" maxlength="10">
					</td>
				</tr>
				<tr>
					<td class="label">
						<label for="email">Email Address</label>
					</td>
					<td class="field">
						<input type="text" name="email" id="email">
					</td>
				</tr>
				<tr>
					<td class="label">
						<label for="password">Password</label>
					</td>
					<td class="field">
						<input type="password" name="password" id="password">
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
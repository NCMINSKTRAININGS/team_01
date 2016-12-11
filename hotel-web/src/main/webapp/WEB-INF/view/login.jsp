<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<div>
    <h2>Sign in to Spitter</h2>
        <form method="post" class="signin" action="<c:url value="/static/j_spring_security_check"/>">
    <fieldset>
            <table cellspacing="0">
                <tr>
                    <th>
                        <label for="username_or_email">LOGIN</label>
                    </th> <td><input id="username_or_email" name="username" type="text" />
                </td>
                </tr>
                <tr>
                    <th>
                        <label for="password">Password</label>
                    </th>
                    <td><input id="password" name="password" type="password" />
                    <!-- Поле ввода пароля -->
                    </td>
                </tr>
                <tr>
                    <th>

                    </th>
                    <td>
                        <input id="remember_me" name="_spring_security_remember_me" type="checkbox"/>
                        <!-- Флажок "запомнить меня" -->
                        <label for="remember_me" class="inline">Remember me</label>
                    </td>
                </tr>
                <tr>
                    <th>

                    </th>
                    <td>
                        <input name="commit" type="submit" value="Sign In" />
                    </td>
                </tr>
            </table>
        </fieldset>
        </form>
    <script type="text/javascript"> document.getElementById('username_or_email').focus(); </script>
</div>

<%--
  Created by IntelliJ IDEA.
  User: vivian
  Date: 9/19/17
  Time: 3:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page isELIgnored = "false" %>

<html>
  <head>
  </head>
  <body>
    <h1>Guichet WEB</h1>
    <ul>
      <li>Nom : ${nom}</li>
      <li>Numero de compte : ${numero}</li>
      <li>Numero de telephone : ${telephone}</li>
      <li>Service : ${service}</li>
      <li>Solde du compte : ${solde}</li>
    </ul>
    <hr>
    <form:form method="POST" action="/depot">
      <table>
        <tr>
          <td><form:label path="montantDepot">Montant du depot</form:label></td>
          <td><form:input path="montantDepot"/></td>
        </tr>
        <tr>
          <td><input type="submit" value="Depot"/></td>
        </tr>
      </table>
    </form:form>
    <form:form method="POST" action="/retrait">
      <table>
        <tr>
          <td><form:label path="montantRetrait">Montant du retrait</form:label></td>
          <td><form:input path="montantRetrait"/></td>
        </tr>
        <tr>
          <td><input type="submit" value="Retrait"/></td>
        </tr>
      </table>
    </form:form>
  </body>
</html>
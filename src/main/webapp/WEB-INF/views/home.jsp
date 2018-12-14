<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1 class="center">Simple page</h1>
	<c:choose>
		<c:when test="${error}">
			<p>An error occur : ${error}</p>
		</c:when>
		<c:otherwise>
			<p>The calcul ${firstOperand} + ${secondOperand} has result
				${resultAdd}</p>
			<p>The calcul ${firstOperand} - ${secondOperand} has result
				${resultSub}</p>
			<p>The calcul ${firstOperand} * ${secondOperand} has result
				${resultMul}</p>
			<p>The calcul ${firstOperand} / ${secondOperand} has result
				${resultDiv}</p>
		</c:otherwise>
	</c:choose>

	<P>The time on the server is ${serverTime}.</P>
</body>
</html>

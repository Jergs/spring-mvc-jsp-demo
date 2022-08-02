<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
    <meta CHARSET="UTF-8">
    <title>Student confirmation</title>
</head>

<body>
The student is confirmed: ${student.firstName} ${student.lastName}

<br><br>

Country: ${student.country}

<br><br>

Favourite Language: ${student.favouriteLanguage}

</body>
</html>
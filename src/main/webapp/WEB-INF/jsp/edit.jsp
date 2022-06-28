<jsp:include page="header.jsp"/>

<html>
<body>
<form action="/user/update" th:object="${news}" enctype="multipart/form-data" method="post">
    <div class="mb-3">
        <label for="exampleInputEmail1" class="form-label">News title</label>
        <input type="text" class="form-control" name="title" id="exampleInputEmail1" aria-describedby="emailHelp">
    </div>
    <div class="mb-3">
        <label for="exampleInputPassword1" class="form-label">News date</label>
        <input type="date" class="form-control" name="date" id="exampleInputPassword1">
    </div>
    <div class="mb-3">
        <label for="exampleInputEmail2" class="form-label">Brief</label>
        <input type="text" class="form-control" name="brief" id="exampleInputEmail2" aria-describedby="emailHelp">
    </div>
    <div class="mb-3">
        <label for="exampleInputEmail3" class="form-label">Content</label>
        <input type="text" class="form-control" name="content" id="exampleInputEmail3" aria-describedby="emailHelp">
    </div>

    <button type="submit" class="btn btn-primary">Submit</button>
</form>
</body>
</html>
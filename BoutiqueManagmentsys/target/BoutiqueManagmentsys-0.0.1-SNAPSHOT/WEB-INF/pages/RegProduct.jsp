<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Boutique Product</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>
    <div class="container mt-5">
        <h2 class="mb-4">Add a New Product</h2>
        <form action="Reg" method="POST">
            <sec:csrfInput /> <!-- ✅ CSRF Token is added here -->
            
            <div class="mb-3">
                <label class="form-label">Product Name:</label>
                <input type="text" name="name" class="form-control" required>
            </div>
            <div class="mb-3">
                <label class="form-label">Description:</label>
                <textarea name="description" class="form-control" required></textarea>
            </div>
            <div class="mb-3">
                <label class="form-label">Price ($):</label>
                <input type="number" name="price" class="form-control" step="0.01" required>
            </div>
            <div class="mb-3">
                <label class="form-label">Stock Quantity:</label>
                <input type="number" name="stock" class="form-control" required>
            </div>
            <div class="mb-3">
                <label class="form-label">Stock Date:</label>
                <input type="datetime-local" name="stockDate" class="form-control" required>
            </div>
            <button type="submit" class="btn btn-primary">Save Product</button>
        </form>
    </div>
</body>
</html>

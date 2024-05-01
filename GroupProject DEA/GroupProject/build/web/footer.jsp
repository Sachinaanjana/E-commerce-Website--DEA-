<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Website Footer</title>
  <style>
    /* Internal CSS styles for the footer */
    footer {
      background-color: #333;
      color: #fff;
      padding: 20px 0;
    }

    .container {
      max-width: 1200px;
      margin: 0 auto;
      padding: 0 20px;
    }

    .footer-content {
      display: flex;
      justify-content: space-between;
      flex-wrap: wrap;
    }

    .footer-section {
      flex: 1;
    }

    h3 {
      font-size: 20px;
      margin-bottom: 10px;
    }

    p {
      font-size: 16px;
      line-height: 1.6;
    }

    hr {
      border: 0;
      border-top: 1px solid #fff;
      margin: 20px 0;
    }

    .text-center {
      text-align: center;
    }
  </style>
</head>
<body>

<footer>
  <div class="container">
    <div class="footer-content">
      <div class="footer-section">
        <h3>About Us</h3>
        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.<br> Sed non maximus erat, et bibendum leo. Duis ut massa ante.<br> Morbi bibendum velit ex.</p>
      </div>
      <div class="footer-section">
        <h3>Contact Us</h3>
        <p>Email: info@example.com<br>Phone: +1234567890<br>Address: 123 Main Street, City, Country</p>
      </div>
    </div>
    <hr>
    <p class="text-center">© 2024 YourWebsiteName. All rights reserved.</p>
  </div>
</footer>

</body>
</html>

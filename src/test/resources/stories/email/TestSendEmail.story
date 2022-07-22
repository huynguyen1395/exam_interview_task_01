Scenario: Test send email  
Given the user login with email 'quochuy13se03@gmail.com' and password 'testGmail1395'
When the user compose email with 'quochuy13se02@gmail.com' and 'Test' and 'Test Email'
Then the user send email
Then check sent email success

Scenario: Go to TestArena.pl site and log in.
Given a http://demo.testarena.pl page.
When field email is filled with administrator@testarena.pl value.
When field password is filled with value sumXQQ72$L.
When button login is pressed.
Then user is logged in and element header_logout is displayed.
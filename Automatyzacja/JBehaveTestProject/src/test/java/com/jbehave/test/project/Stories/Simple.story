Meta:
@author Mateusz Smiech


Scenario: Go to TestArena.pl site and log in.
Given a http://demo.testarena.pl page.
When field email is filled with administrator@testarena.pl value.
When field password is filled with value sumXQQ72$L.
When button login is pressed.
Then user is logged in and element header_logout is displayed.


Scenario: Add new project in TestArena application.
Given logged in user in project creation panel.
When project field name is filled with value TestProjectV3.
When project field prefix is filled with prefx2 value.
When project field description is filled with value This is description.
When project button save is clicked.
Then new project is created and SUSPEND button is displayed.

Scenario: Add new test case.
Given logged in user in test case creation window.
When TC field name with id name is filled with TC_MS_2 value.
When TC field description with id description is filled with New Desctription value.
When TC field prerequisites with id presuppositions is filled with Preconditions value.
When TC field expected result with id result is filled with Works as expected value.
When TC button Save with id add is clicked.
Then new test case is created and button with id j_restoreButton is displayed.

Scenario: Add new exploratory test.
Given logged in user in exploratory testing creation panel.
When Explore field with id name is filled with Exploratory1 value.
When time in duration field with path //*[@id="content"]/article/form/div[3]/span/span/a[1]/span/span is added 5 times (It is 25 minutes).
When test charter field with id testCard is filled with Test charter value.
When button Save with id add is clicked.
Then new exploratory test case is created and button with id j_restoreButton is displayed.

Scenario: Add new defect.
Given logged in user in new defect window.
When Defect field title with id title is filled with NewDefect2 value.
When Defect field description with id description is filled with This is description value.
When Defect field environments with id token-input-environments is filled with QA env.
When Defect field versions with id token-input-versions is filled with qwe version.
When Defect button Assign to me button is clicked.
When Defect field priority with id priority and value Trivial is selected.
When Defect button save with id save is clicked.
Then new defect is added and button RESOLVE is displayed.
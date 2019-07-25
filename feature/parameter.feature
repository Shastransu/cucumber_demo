Feature:Login Action

Scenario Outline: Successfull Login with valid creditals
Given User is open the application
When User click on to signin link
And User enters "<username>" and "<password>"
Then Message displayed Login successfully


Examples:
| username | password|
|lalitha   | password123|
|admin     | password456|  
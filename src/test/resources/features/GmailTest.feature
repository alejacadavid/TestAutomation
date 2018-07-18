Feature: GmailTest

  @Gmail
    Scenario: Send a email with file attach
      Given a browser with the page of gmail
      When the user enter the "username" and the "password"
      Then should be send a email to "email" with a file in the path "/home/s4n/Pictures"


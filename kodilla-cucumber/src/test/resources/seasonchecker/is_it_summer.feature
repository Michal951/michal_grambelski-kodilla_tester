Feature:  Is it Summer? Everybody likes Summer.

  Scenario: Winter isn't Summer.

  Given: Today is last day of December
  When:  I ask whether it's Summer
  Then:  I should be told "Nope"

    Scenario: Summer is summer
      Given: today is first day of Agust
      When: I ask whether it's Summer
      Then: I should be told "Yes! Summer!"

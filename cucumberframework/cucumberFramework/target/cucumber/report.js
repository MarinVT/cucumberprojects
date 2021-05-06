$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ContactUsForm.feature");
formatter.feature({
  "line": 1,
  "name": "Fill submit form",
  "description": "",
  "id": "fill-submit-form",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5970069600,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Submit valid data via contact us form",
  "description": "",
  "id": "fill-submit-form;submit-valid-data-via-contact-us-form",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I access webdriveruniversity website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on contact us form",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I enter user first name",
  "rows": [
    {
      "cells": [
        "marin",
        "igrata",
        "nomer1"
      ],
      "line": 7
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter user last name",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter valid email address",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter comments",
  "rows": [
    {
      "cells": [
        "Example2",
        "Example2"
      ],
      "line": 11
    },
    {
      "cells": [
        "Example2",
        "Example2"
      ],
      "line": 12
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on submit button",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "The information should be successfully submitted",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactUsForm.i_access_webdriveruniversity_website()"
});
formatter.result({
  "duration": 960484400,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsForm.i_click_on_contact_us_form()"
});
formatter.result({
  "duration": 106615200,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsForm.i_enter_user_first_name(DataTable)"
});
formatter.result({
  "duration": 2171573900,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsForm.i_enter_user_last_name()"
});
formatter.result({
  "duration": 44489000,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsForm.i_enter_valid_email_address()"
});
formatter.result({
  "duration": 70984000,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsForm.i_enter_comments(DataTable)"
});
formatter.result({
  "duration": 131889100,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsForm.i_click_on_submit_button()"
});
formatter.result({
  "duration": 188400,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsForm.the_information_should_be_successfully_submitted()"
});
formatter.result({
  "duration": 66000,
  "status": "passed"
});
});
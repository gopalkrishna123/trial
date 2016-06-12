$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("homepage.feature");
formatter.feature({
  "line": 2,
  "name": "Home page",
  "description": "\r\n\r\nAs a user\r\nI want to goto HomePage and seee all\r\nthe functionalities of home page\r\nSo that I will get an overview of paytm website.",
  "id": "home-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@wip"
    }
  ]
});
formatter.background({
  "line": 10,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 11,
  "name": "Iam on paytm LandingPage",
  "keyword": "Given "
});
formatter.match({
  "location": "homepagestepdef.Iam_on_paytm_LandingPage()"
});
formatter.result({
  "duration": 18266351868,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "",
  "description": "",
  "id": "home-page;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "I Click on login button",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I enter username and password",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I should click on Mobile Link",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I should click on DTH Link",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I should click on DataCard Link",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I should click on LandLine Link",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I should click on Electricity Link",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "homepagestepdef.I_should_click_on_Mobile_Link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "homepagestepdef.I_should_click_on_DTH_Link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "homepagestepdef.I_should_click_on_DataCard_Link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "homepagestepdef.I_should_click_on_LandLine_Link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "homepagestepdef.I_should_click_on_Electricity_Link()"
});
formatter.result({
  "status": "skipped"
});
});
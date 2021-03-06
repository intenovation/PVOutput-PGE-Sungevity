# PVOutput-PGE-Sungevity
Code to pull data from PGE and Sungevity and Push to PVOutput so you can see both, your solar production and usage on same place.


This code depends on another project https://github.com/qwertangel/getPGEUsageData which uses casperjs (headless browser) to log into PGE's website and download usage data. 

Steps to use

1. Make sure you can login into your PG&E account and have your username, password. (http://www.pge.com/)
2. Make sure you can login into your Sungevity account and have your username, password. (https://star.oursungevity.com/login)
3. Create an account at PVOutput.org if you don't have it already. (http://pvoutput.org/register.jsp)
4. Go to settings after you login to pvoutput.org (http://pvoutput.org/account.jsp) and scroll to bottom of page and make these changes.
  a. set 'API Access' to 'enabled'
  b. hit 'new key' and record the the value generated.
  c. Under 'registered systems' , click 'add system'. Most of the fields when creating system are optional. Make sure to just give a name to your PV system.
  d. hit save and note the id of your system. You will need key from step b and your system id for this program to work.
5. enter your PGE credentials, Sungevity credentials and pvoutput api key and id in config.properties in the code. Make sure config.properties folder is in  your classpath.
6. This program also tracks user daily usage on a google spreadsheet. That sheet is also used to track last download date so that you don't loose data for days when either program doesn't run or PGE delays loading of data.

That's it. Then you can run com.droidbytes.RecordPVOutput. 

Check the wiki at https://github.com/qwertangel/PVOutput-PGE-Sungevity/wiki


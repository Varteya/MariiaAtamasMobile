For run tests:
1. Make sure, that you have tuned environment (adb, local variables, etc);
2. Log in EPAM Mobile Cloud Service;
3. Write your personal token in pom.xml;
4. Choose device ant write deviceName or bundleID in *.xml file for the chosen profile;
4.a If you want to test native application, install it on the device via mobile cloud tools;
4. Change properties in nativeTNG.xml and webTNG.xml, if you need it;
5. Run tests by maven profiles.
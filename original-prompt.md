I have already done a successful change that added the transparency slider (use git log to find out more). The app builds and functions well enough.

Here is your goal, starting with the most urgent task:

1. "Hide keyboard in browser" is broken and doesn't disable the keyboard. I recall it made the keyboard persistent instead even after tapping out of the field on the browser when enabled. Replace the toggle with something that enables the user to select the following modes:

- Keyboard: Should function the same as toggling off the current "Hide keyboard in browser." This allows the keyboard to show and function properly.

- Built-in Keyboard: Instead of a normal keyboard, the app shows a built-in keyboard with basic functionalities. The built-in keyboard should not be separate; It closes when the user closes the browser. Unlike the system keyboard, the built-in keyboard should adhere to the current transparency slider.

- Paste: Instead of a keyboard, the app shows a paste button. It can paste the clipboard content to the focused field in the browser. The keyboard stays hidden.

- Nothing: Disables the keyboard from showing.

2. A while back, I recall that the app could randomly lose access to the internet. Websites won't load and generate an error page by Android WebView. It is occurring rarely now, although if it does occur in a moment where I cannot restart the floating bubble, it could be a bit devastating. Could you investigate the cause of this error and whether it could be fixed? Either by solving the problem or doing a workaround by implementing a button on the bubble (where the "Hide keyboard in browser" resides) that could close and restart the floating bubble by itself (this restart button could also be a potential solution to goal number 3!).

After that, do a git commit and consider these additional, non-urgent tasks. Evaluate if you should do these tasks or not. The tasks are sorted by importance, but not urgent:

3. The current transparency slider can change the alpha value of the floating browser layout in real time, but it only partially works on some phones. On my primary device, the real-time feature is broken. I have to open the floating bubble, set the transparency slider, and manually restart the floating bubble via the app to set the transparency value. Is it possible to make it compatible with my phone?

4. Randomly, the system shows a one-time warning that the app is not responding, although the app works fine. It goes away when I click dismiss. The issue has been occurring even before my changes. When I click terminate app, a crash log can be recorded, and it is currently sitting inside @Crash/.. I don't really recommend doing this, as it is just a one-time annoyance that goes away easily. Although, give me a little insight on what is actually causing the crash.
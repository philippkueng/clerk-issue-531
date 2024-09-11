# Attempt to reproduce issue https://github.com/nextjournal/clerk/issues/531

My reproduction fails with the error `Invalid symbol: Note:.` which I believe is probably identical in respects to the origin of the issue.

To start up the project do the following:

1. Install python3, pip3 and virtualenv
2. Run `virtualenv venv` to create a virtual environment directory.
3. Activate the new virtual environment `source venv/bin/activate`
4. Install matplotlib `pip install matplotlib`
5. Start up the REPL within the activated virtual environment `clj -m nrepl.cmdline`
6. Once the browser opens up, enable the last line in `notebooks/issue_reproduction.clj` and see the error appear.

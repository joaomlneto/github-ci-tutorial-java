# Tutorial: Java CI using GitHub Actions
A working minimal example on how to use GitHub Actions for CI in a Java project.

[![Run Maven Tests on Push to Main](https://github.com/joaomlneto/github-ci-tutorial-java/actions/workflows/run-maven-tests-on-push.yaml/badge.svg)](https://github.com/joaomlneto/github-ci-tutorial-java/actions/workflows/run-maven-tests-on-push.yaml)

This repository has a [workflow](.github/workflows/run-maven-tests-on-push.yaml) that is triggered whenever code is pushed to the `main` branch and checks whether the checked-in code passes the tests.

[Click here for the example using Travis CI instead of GitHub Actions](https://github.com/joaomlneto/travis-ci-tutorial-java)

### How can I play with it myself?
1. [Fork this repository](https://github.com/joaomlneto/github-ci-tutorial-java/fork).
2. Fix the `README.md` badges (replacing all occurrences of `joaomlneto` with ***your GitHub username***) and push the changes.
3. Verify if workflow executes and test pass, going to the [Actions](https://github.com/joaomlneto/github-ci-tutorial-java/actions) tab.

### Contributing
Mistakes? Questions? Suggestions?
[Open an Issue](https://github.com/joaomlneto/github-ci-tutorial-java/issues/new)!

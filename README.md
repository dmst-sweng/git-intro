git-intro
=========

## Build Status
[![Build Status](https://travis-ci.org/dmst-sweng/git-intro.svg?branch=master)](https://travis-ci.org/dmst-sweng/git-intro)
=========

# An introduction to Git's collaboration style.

## Assignment

### Initial action

Select a task from the list below and tackle it.
Feel free to add a task to the existing tasks.
To avoid conflicts between each other, once you clone
this repository:
* select a task,
* put your GitHub user name next to the task (as I have done)
  noting that it is work in progress,
* commit the change to this file, and
* push your commit to the upstream repo at GitHub so that
  your colleagues can see that the task is taken.

Note: if your commit is not accepted when you try to push
this means that one of your colleagues has updated the repo
in the interim (between the time you cloned and pushed).
Pull the changes to your local repository, merge any conflicts,
and try to push again.
Don't worry if it happens, you will get extra credit for that :-)

### Work guide

All tasks should be done in a new branch that
should be merged to the master branch after
a task is successfully completed.
Don't delete your branch afterwards.

In your branch, explain briefly the Git commands you used to complete the task
in a new file named Changelog followed by an underscore followed by your GitHub
user name (for me it would be Changelog_mfragkoulis).
Place the Changelog file under version control.

Don't forget to put your GitHub user name next to the task
you undertook (see below).

### Tasks to do:

* Set up task list -> mfragkoulis
* Cleanup repository
 * Generated files (e.g. .class files) should not be under version
   control; remove them.
* Place the story in folder test_branch with the rest of the stories
   and remove folder test_branch -> p3110145
* Upgrade sentence() method
 * Print chars one by one. -> efstrian
* Refactor code
 * Fix code alignment -> theosotr
 * Set number of characters per line to be up to 80 -> theosotr
 * Class names should follow unanimous style (e.g. AdventureStory, ScaryStory)->KonPap18
 * Enhance code readability (e.g use the sentence() method everywhere)-> KaterinaADAM
 * Format the printers so that the story is printed out in a tidier way->lakitas(inserted the task)
* Document code
 * Place comments on top of methods -> konpapa
 * Place comments inline to the code if/when needed (use sparingly).->cheeseplate
* Generate javadoc for ExcitingStory.java and place it in a docs folder -> dimana
* Fix code errors
 * Option -y does not work properly -> kostastsili94
 * Option -z does not work properly->ppeponis
* Project setup
 * Build project with Maven -> htsili
 * Integrate project with Travis-ci. -> htsili
* Add story in ExcitingStory.java
 * Add a short joke. -> k-karakatsanis
 * Add a sub-story. -> Melmel
 * Add a a myth about Zeus and Prometheus. -> xristosoik
 * Add a song about Java. -> eletap
 * Add an interesting story. -> katerinakaplani
 * Add a weird story. -> SPYROS-GER
 * Add a love story. -> XaLDe


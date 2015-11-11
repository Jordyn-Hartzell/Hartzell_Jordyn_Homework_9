# Hartzell_Jordyn_Homework_9 
## Introduction
### Outline
### References
# Code
## Console
### Command Prompt
First I navigated to my project.
```
C:\Users\Jordyn>e:

E:\>cd Jordyn_CS1_Workspace

E:\Jordyn_CS1_Workspace>cd Hartzell_Jordyn_Homework_9

E:\Jordyn_CS1_Workspace\Hartzell_Jordyn_Homework_9>dir
 Volume in drive E is Lexar
 Volume Serial Number is 585B-9A7C

 Directory of E:\Jordyn_CS1_Workspace\Hartzell_Jordyn_Homework_9

11/10/2015  05:46 PM    <DIR>          .
11/10/2015  05:46 PM    <DIR>          ..
11/10/2015  05:46 PM               402 .project
11/10/2015  05:46 PM    <DIR>          src
11/10/2015  05:46 PM    <DIR>          bin
11/10/2015  05:46 PM               232 .classpath
               2 File(s)            634 bytes
               4 Dir(s)   7,915,307,008 bytes free
```
After I found my project, I used the GitHub instructions to sync my local repo to the remote repo. I also had to configure my user information to avoid an error.
```
E:\Jordyn_CS1_Workspace\Hartzell_Jordyn_Homework_9>echo # Hartzell_Jordyn_Homewo
rk_9 >> README.md

E:\Jordyn_CS1_Workspace\Hartzell_Jordyn_Homework_9>git init
Initialized empty Git repository in E:/Jordyn_CS1_Workspace/Hartzell_Jordyn_Home
work_9/.git/

E:\Jordyn_CS1_Workspace\Hartzell_Jordyn_Homework_9>git config user.name "Jordyn
Hartzell"

E:\Jordyn_CS1_Workspace\Hartzell_Jordyn_Homework_9>git config user.email "hartze
llj@student.swosu.edu"

E:\Jordyn_CS1_Workspace\Hartzell_Jordyn_Homework_9>git add README.md

E:\Jordyn_CS1_Workspace\Hartzell_Jordyn_Homework_9>git commit -m "first commit"
[master (root-commit) 7966000] first commit
 1 file changed, 1 insertion(+)
 create mode 100644 README.md

E:\Jordyn_CS1_Workspace\Hartzell_Jordyn_Homework_9>git remote add origin https:/
/github.com/Jordyn-Hartzell/Hartzell_Jordyn_Homework_9.git

E:\Jordyn_CS1_Workspace\Hartzell_Jordyn_Homework_9>git push -u origin master
Username for 'https://github.com': jordyn-hartzell
Password for 'https://jordyn-hartzell@github.com':
Counting objects: 3, done.
Writing objects: 100% (3/3), 251 bytes | 0 bytes/s, done.
Total 3 (delta 0), reused 0 (delta 0)
To https://github.com/Jordyn-Hartzell/Hartzell_Jordyn_Homework_9.git
 * [new branch]      master -> master
Branch master set up to track remote branch master from origin.
```
I didn't want to work out of my master branch, so I set up a new development branch.
```
E:\Jordyn_CS1_Workspace\Hartzell_Jordyn_Homework_9>git checkout -b dev
Switched to a new branch 'dev'

E:\Jordyn_CS1_Workspace\Hartzell_Jordyn_Homework_9>git add .

E:\Jordyn_CS1_Workspace\Hartzell_Jordyn_Homework_9>git commit -m "First running
line of code"
[dev 507b5b8] First running line of code
 4 files changed, 30 insertions(+)
 create mode 100644 .classpath
 create mode 100644 .project
 create mode 100644 bin/Addition_Game_Methods_and_Loops.class
 create mode 100644 src/Addition_Game_Methods_and_Loops.java
```
Here I tried to commit and push changes, but the dev branch was not linked to the remote repository.
```
E:\Jordyn_CS1_Workspace\Hartzell_Jordyn_Homework_9>git add .

E:\Jordyn_CS1_Workspace\Hartzell_Jordyn_Homework_9>git commit -m "Added quiz que
stion method"
[dev 7938266] Added quiz question method
 2 files changed, 25 insertions(+), 3 deletions(-)
 rewrite bin/Addition_Game_Methods_and_Loops.class (78%)

E:\Jordyn_CS1_Workspace\Hartzell_Jordyn_Homework_9>git push
warning: push.default is unset; its implicit value has changed in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the traditional behavior, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

When push.default is set to 'matching', git will push local branches
to the remote branches that already exist with the same name.

Since Git 2.0, Git defaults to the more conservative 'simple'
behavior, which only pushes the current branch to the corresponding
remote branch that 'git pull' uses to update the current branch.

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

fatal: The current branch dev has no upstream branch.
To push the current branch and set the remote as upstream, use

    git push --set-upstream origin dev
```
I used git push -u to set up tracking on my dev branch.
```
E:\Jordyn_CS1_Workspace\Hartzell_Jordyn_Homework_9>git push -u origin dev
Username for 'https://github.com': jordyn-hartzell
Password for 'https://jordyn-hartzell@github.com':
Counting objects: 14, done.
Delta compression using up to 2 threads.
Compressing objects: 100% (14/14), done.
Writing objects: 100% (14/14), 2.71 KiB | 0 bytes/s, done.
Total 14 (delta 3), reused 0 (delta 0)
To https://github.com/Jordyn-Hartzell/Hartzell_Jordyn_Homework_9.git
 * [new branch]      dev -> dev
Branch dev set up to track remote branch dev from origin.
```
# Summary
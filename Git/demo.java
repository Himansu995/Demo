//package Git;

// Working dir.
// Staging area- git will monitor these
// if we add commit to file and make any changes then we have to move it tyo satging area again




// git init (will be on branch master)
// git status (to check)
// to change branch delete git folder from ur working folder manually
// git init -b main
// git add filename.xyz or foldername to add to cache in git repo
// git rm --cached filename to unstage
// git log to see all commits
// git commit -m "message"

//      commiting generates some random code [main (root-commit) 2f7061f]
//          this is checksum value of 40 characters

//      if we change even a word then we ahve to add it again to git before commit 
//          to skip this add again and again use :-
//                 git commit -a -m "xyz" (but it will use git add . inbuilt that will add all files to git)

// git diff to get changes in file from last added 
// q to quit if no moore input are going in terminal
// git commit . will add all files to git
// git rm --cached filename to remove from git

// From github:-
// git clone link :- to copy any http link of code of github repo in sysytem


// **********22:10:00 to create repo
// git init -b main
// git add .
// git commit -m "first commit"
// git remote add origin https://github.com/you/repo.git
// git push -u origin main


//********** to change any file and reupload
// git status
// git add .
// git commit -m "your message here"
// git push

// to see all versions or previous data :- see history and go to commit and  data at that commit will be there

// tags :- name or version of that commit
// git add .
// git commit -m "Project complete"
// git tag -a v1.0 -m "Submission version"
// git push
// git push --tags

// to do some changes and want to prevent old version also then create new branch and do changes in them
// git checkout -b branchname 
// git branch :- to see all branch

// git switch branchname :- code will also go to what was in that branch



public class demo {
    public static void main(String []args){

    }
}

# Spohn App
This is the application for people associated with the Spohngymnasium in Ravensburg, Germany.

It aims to provide easy access to relevant information regarding the students and teachers lives at school,
for example a list of current substitutions or news.

## Features
- Substitutions (planned)
  - Filterable by class (planned)
- News feed (planned)
- Current cantine menu (planned)
- Integration with the students timetable (planned)

# Contributing
Contributions to this repository are always welcome.  
However, please conform to the following guidelines to keep this project clean:

## Development environment
This is a [KotlinMultiplatformMobile (KMM)](https://kotlinlang.org/lp/mobile/) project.  
Therefore, we are using [AndroidStudio](https://developer.android.com/studio/) and [Xcode](https://developer.apple.com/xcode/),
as well as the AndroidStudio plugin for KMM. Please refer to the setup manual for KMM to setup your IDE.

## Repository layout
We use the following system for branching:

| Branch          | Usage                                                                                                                                                                                                                                                                                                                                                                                          |
|-----------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `develop`       | This is the default branch. Developing of new features happens here.                                                                                                                                                                                                                                                                                                                           |
| `feature/<xyz>` | These are custom branches created for each feature. They are forked off the protected `develop`-Branch and are merged back into `develop` after the feature is done.                                                                                                                                                                                                                           |
| `testing`       | After the changes in `develop` are ready for a new release, they are merged into this branch.<br/>Here, the complete App is to be tested with unit tests and also manually, before deploying it to production!<br/>If any bugs are found during testing or in production, they are fixed in this branch.<br/>If a feature turns out to be incomplete, it returns to its own `feature/`-Branch. |
| `production`    | When testing is done, `testing` is merged here and a new version is released. No developing whatsoever is done on this branch!<br/>Each release that is rolled out should also be tagged with the version number. One can also make use of GitHub releases to ship signed app bundles.                                                                                                         |
| `documentation` | This branch is not for any form of coding, but only for updates to documentation (like this README)                                                                                                                                                                                                                                                                                            |

The main branches `develop` and `production` are protected, which means, one can't directly push code to them. They have to be adressed using pull requests.

## Coding Guidelines and Documentation
### Feature planning
Before you begin developing a feature, you need to plan its structure with [UML](https://en.wikipedia.org/wiki/Unified_Modeling_Language).  
This helps you and others understand, what your code is supposed to be doing and provides a structure for you during development of said feature.  
You could, for example, use [Visual Paradigm](https://www.visual-paradigm.com/) or any other UML or flowchart program.

Put the completed flowchart in [docs/classCharts](docs/classCharts).

### File length
Source code file *should not* be longer than 200 lines in total. If a file becomes longer than this limit, split it up into multiple files according to their functionality.  
This keeps the code within a file comprehensible.

### Documentation
Every function, **no matter how trivial**, is to be documented!  
Each function of the code must be understood by simply looking at it to grasp the concepts of a feature.  
Also, every function has to be understood by looking at the pop-up documentation inside code-completion to be able to code more efficently
without looking up the source of every function one wants to use.

### Ownership declaration
At the beginning of each file has to be a declaration of code ownership (i.e. who wrote this code**.  
With this ownership information, future developers seeking to understand or modify the code know whom to ask questions regarding the code.  
If code is amended by someone, said person should also add their name to the header.

### Commits
Every commit is required to have a meaningful commit message, outlining the changes in detail!  
**DO NOT** write something like `bug fix` as only text into the message, but rather explain which bug was fixed.

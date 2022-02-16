# CAP CDS Language Support
| Buildstatus |                                                                                                                                                                                                  |
|-------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Main        | [![CodeQL](https://github.com/TheYaINN/CDS-Plugin/actions/workflows/codeql-analysis.yml/badge.svg?branch=master)](https://github.com/TheYaINN/CDS-Plugin/actions/workflows/codeql-analysis.yml)  |
| Develop     | [![CodeQL](https://github.com/TheYaINN/CDS-Plugin/actions/workflows/codeql-analysis.yml/badge.svg?branch=develop)](https://github.com/TheYaINN/CDS-Plugin/actions/workflows/codeql-analysis.yml) |

This Project is a simple SAP CAP CDS languge support for IntelliJ.

## Table Of Content
* [General](#general)
* [Changelog](#changelog)
* [Roadmap](#roadmap)
* [License](./LICENSE)

## General

Want to support me with a donation? <a href="https://www.paypal.com/donate/?hosted_button_id=ZF95ZSZUWBCR8">click
here!</a> <br>
Want to support otherwise? -> help me improve the plugin by opening issues or contribute with your own code!

## Contextual Information

The `type` is strictly not a keyword or reserved in CDS, yet to avoid parsing errors it is seen as a reserved word.

## Changelog
* 0.3.5
  * BNF massively improved
  * Improved Syntax Highlighting
  * Added more Annotations and refactored BNF File
  *

* 0.3.41
  * BNF improved
    * The Entity syntax is now simplified to a general entity, whether it is defined within a service or as a normal
      entity.
    * fixed block comments
    * fixed strings
    * added codestyle and codestyle provider, waiting for implementation
    * changed SpaceRequirements to `must`

* 0.3.0
  * Add missing implementations
  * Improve highlighting for annotations
  * Improve syntax for annotations to support more</li>

* 0.2.0
  * Add Commenter
  * Improved highlighting
  * Improved BNF

* 0.1.0
  * Simple Highlighting
  * Simple Syntax checking

## Roadmap
* Add completion contributor
* Add reference contributor
* Add usage provider
* Support UI annotations
* Add Formatter
* Add Default Code Style Settings
* Add Quick fix
* Add Support for auto-generate CSV files for test data
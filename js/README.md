# Instagram Validator

This is a non-official Instagram validator.

Since Instagram doesn't provide an official one, this library serves as an alternative.


## Install

```
$ npm install instagram-validator
```


## Usage

```js
const iv = require('instagram-validator');

iv.isValidHashtag('#hello'); // true

iv.isValidHashtag('#hello.world'); // false

iv.isValidHashtag('#5566'); // true
```


## Test

```
$ npm test
```

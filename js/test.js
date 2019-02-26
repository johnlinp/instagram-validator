const assert = require('assert');
const iv = require('./index.js');

assert.strictEqual(true, iv.isValidHashtag('#hello'));
assert.strictEqual(true, iv.isValidHashtag('#5566'));
assert.strictEqual(true, iv.isValidHashtag('#sk8erboi'));
assert.strictEqual(true, iv.isValidHashtag('#__init__'));
assert.strictEqual(true, iv.isValidHashtag('#EricClapton'));
assert.strictEqual(true, iv.isValidHashtag('#___'));

assert.strictEqual(false, iv.isValidHashtag('xxx'));
assert.strictEqual(false, iv.isValidHashtag('#hello.world'));
assert.strictEqual(false, iv.isValidHashtag('#2+2=5'));
assert.strictEqual(false, iv.isValidHashtag('#hello world'));
assert.strictEqual(false, iv.isValidHashtag(' #hello'));
assert.strictEqual(false, iv.isValidHashtag('#hello '));
assert.strictEqual(false, iv.isValidHashtag('#coca-cola'));
assert.strictEqual(false, iv.isValidHashtag('#why!?'));
assert.strictEqual(false, iv.isValidHashtag('#said:what'));

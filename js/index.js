var isValidHashtag = function(str) {
    var match = str.match(/^#[^~`!@#$%^&*\(\)\-\+={}\[\]:;"'<>\?,\./|\\\s]+$/);
    return (match !== null);
};

module.exports = {
    isValidHashtag
};

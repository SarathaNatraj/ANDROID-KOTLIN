const { describe } = require('node:test');
const add = require('./sum');

describe('Add JS test cases', () => {

    //test case 1 - sucess test case
    test('adds 1+2 to equals 3', () => {
        //add(1,2) => 3 === 3
        expect(add(1, 2)).toBe(3);
    });


    //test case 2 - success test case
    test('adds 5+6 to equals 11', () => {
        //add(5,6) => 11 === 11
        expect(add(5, 6)).toBe(11);
    });

    //test case 3 - success test case
    test('adds 5+6 to equals 10', () => {
        //add(5,6) => 11 !== 10
        expect(add(5, 6)).not.toBe(10);
    });

    //test case 4 - failure test case
    it('adds -1+-3 to equals -4', () => {
        //add(-1,-3) => -4 === -4
        expect(add(-1,-3)).toBe(-4);
    });

});
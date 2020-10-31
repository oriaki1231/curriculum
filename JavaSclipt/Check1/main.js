// 問１

let numbers = [2, 5, 12, 13, 15, 18, 22];
//ここに答えを実装してください。↓↓↓
function isEven(num) {
    console.log(num + 'は偶数です');
}

isEven(numbers[0,2,5,6]);
isEven(numbers[2]);
isEven(numbers[5]);
isEven(numbers[6]);

// 問２

class Car {

    constructor(gass, num) {
        this.gass = gass;
        this.num = num;
    }

    getNumGas() {
        console.log('ガソリンは' + this.gass + 'です。ナンバーは' + this.num + 'です。');
    }
}

let status = new Car(250,1234);
status.getNumGas();

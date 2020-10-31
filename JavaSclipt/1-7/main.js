class Taiyaki {

    constructor(name) {
        this.name = name;
    }

    inside() {
        console.log('中身は' + this.name + 'です');
    }
}

let anko = new Taiyaki('あんこ');
anko.inside();

let cream = new Taiyaki('クリーム');
cream.inside();

let cheese = new Taiyaki('チーズ');
cheese.inside();
export class FormatDate {
  static formatDate(date: string): string {
    const dateObj = new Date(date);
    let d = dateObj.toLocaleDateString('es-ES', { year: 'numeric', month: '2-digit', day: '2-digit' });
    return d;
  }
}